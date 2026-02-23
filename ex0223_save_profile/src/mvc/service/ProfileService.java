package mvc.service;


import mvc.dto.Profile;
import mvc.exception.NameDuplicationException;
import mvc.exception.SearchNotFoundException;

public interface ProfileService {

    /**
     * 프로필 등록
     * @param profile
     */
    public void insert(Profile profile) throws NameDuplicationException;


    
    /**
     * 이름으로 프로필 불러오기
     * @param name
     * @return
     */
    public Profile searchByName(String name) throws SearchNotFoundException;
    
}



