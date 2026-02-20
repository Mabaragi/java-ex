package mvc.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DiscountBoundsException;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	System.out.println("**private constructor init.....");
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
     	   String data[] = value.split(",");
     	   //System.out.println(key +" = " + value);
     	  
     	     list.add(new Electronics( Integer.parseInt(data[0]) ,data[1],   
     	    		 Integer.parseInt( data[2]), data[3]) );
     	  
        }
        
        System.out.println(list);
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) 
			  throws ElectronicsArrayBoundsException, DuplicateModelNoException {
		if (list.size() >= this.MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("저장할 수 있는 전자제품 개수를 초과했습니다. (" + this.MAX_SIZE+ ")개" );
		}
		for (Electronics stored : list) {
			if (electronics.getModelNo() == stored.getModelNo()) {
				throw new DuplicateModelNoException("모델 번호가 중복됩니다.");
			}			
		}
		list.add(electronics);		
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for (Electronics electronics : list) {
			if (modelNo == electronics.getModelNo()) {
				return electronics;
			}
		}
		throw new SearchNotFoundException(modelNo+"는 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		for (Electronics stored: list) {
			if (stored.getModelNo() == electronics.getModelNo()) {
				stored.setModelDetail(electronics.getModelDetail());
				return;
			}
		}		
		throw new SearchNotFoundException(electronics.getModelNo()+"는 없는 모델번호로 업데이트할 수 없습니다.");
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getModelNo() == modelNo) {
				list.remove(i);
				return;
			}
		}
		throw new SearchNotFoundException(modelNo+"는 없는 모델번호로 삭제할수 없습니다.");		
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		list.sort(Comparator.comparing(Electronics::getModelPrice).thenComparing(Electronics::getModelNo));
		return list;
	}

	@Override
	public void updateDiscount(int modelNo, int discountPercent) throws DiscountBoundsException, SearchNotFoundException {
		if (discountPercent <= 0 || discountPercent >= 100) {
			throw new DiscountBoundsException("올바른 할인율을 입력하세요.");
		}
		for (Electronics electronics : list) {
			if (electronics.getModelNo() == modelNo) {
				int saledPrice = electronics.getModelPrice() * (100 - discountPercent) / 100;
				electronics.setModelPrice(saledPrice);
				return;
			}
		}
		throw new SearchNotFoundException(modelNo+"는 없는 모델번호로 업데이트 할수 없습니다.");	
	}

	@Override
	public List<Electronics> searchModelName(String modelName)
	        throws SearchNotFoundException {
		List<Electronics> searchResult = new ArrayList<Electronics>();
		for (Electronics electronics : list) {
			if (electronics.getModelName().equals(modelName)) {
				searchResult.add(electronics);
			}
		}		
		if (searchResult.isEmpty()) {
			throw new SearchNotFoundException(modelName+"는 없는 이름으로 결과가 없습니다.");
		}
		return searchResult;
	}
    
	
} // 클래스 끝 