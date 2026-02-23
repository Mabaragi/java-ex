package mvc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import mvc.dto.Profile;
import mvc.exception.NameDuplicationException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ProfileServiceImpl implements ProfileService {
	
	
	private static ProfileService instance = new ProfileServiceImpl(); 
    List<Profile> list;
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ProfileServiceImpl() {
    	// 객체를 저장한 파일이 존재하면 파일을 로딩 그게 아니면 InitInfo 로딩
    	
    	
    	System.out.println("**private constructor init.....");
    	
		File file = new File("profile.txt");
		// 파일 없으면 빈 배열 초기화
		if (!file.exists()) {
			list = new ArrayList<Profile>();
		} else {

			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
					
					
			list = (List<Profile>)ois.readObject();					
					
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
				
        
        System.out.println(list);
      
    }
	public static ProfileService getInstance() {
		return instance;
	}
	@Override
	public void insert(Profile profile) throws NameDuplicationException {
		// 이름 중복 검사
		String name = profile.getName();
		System.out.println(name + "이 중복되었는지 검사합니다.");
		Profile result = this.checkProfileByName(name);
		if (result != null) {
			throw new NameDuplicationException("이미 존재하는 이름입니다.");
		}
		this.list.add(profile);
		this.saveProfileList();
	}
	@Override
	public Profile searchByName(String name) throws SearchNotFoundException{		
		Profile profile = this.checkProfileByName(name);
		if (profile != null) {
			return profile;
		}
		throw new SearchNotFoundException(name + "에 해당하는 정보는 없습니다.");
	}
    
	private Profile checkProfileByName(String name){
		for (Profile profile : list) {
			if (profile.getName().equals(name)) {
				return profile;
			}
		}
		return null;
	}

	private void saveProfileList(){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profile.txt"))){
			oos.writeObject(this.list);			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

    	
} // 클래스 끝 