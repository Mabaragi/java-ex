package mvc.service;

import java.util.List;

import mvc.dto.Electronics;
import mvc.exception.DiscountBoundsException;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

public interface ElectronicsService {

    /**
     * 전자제품 등록
     *
     * @param electronics
     * 
     * : 최대 List에 저장된 객체의 개수가 MAX_SIZE를 벗어나면 
     *    ElectronicsArrayBoundsException 예외발생
     *      - 예외메시지 : 배열의 길이를 벗어나 더이상 등록 할수 없습니다.
     *      
     *      
     *    modelNo가 중복이면 DuplicateModelNoException 발생시킨다.
     * 
     */
    public void insert(Electronics electronics) 
    		throws ElectronicsArrayBoundsException , DuplicateModelNoException;

    /**
     * 등록된 전체 전자제품 검색 
     * @return
     */
    public List<Electronics> selectAll() ;
    
    /**
     * 모델번호에 해당하는 전자제품 검색 
     * @param modelNo
     * @return
     *   : 만약 찾는 정보가 없으면 
     *      SearchNotFoundException 예외발생
     *       -예외메시지 : modelNo+"는 없는 모델번호로 검색할수 없습니다."
     */
    public Electronics searchByModelNo(int modelNo)throws SearchNotFoundException ;


    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * (설명만 수정한다)
     * @param electronics
     *  : 수정전에 모델번호에 해당하는 정보가 있는지를 찾고 없으면
     *     SearchNotFoundException 예외발생
     *     있으면 전자제품 모델번호에 해당하는 설명을 수정한다.
     */
    public void update(Electronics electronics) throws SearchNotFoundException;
    
    
    /**
     * 모델번호에 해당하는 전자제품 삭제하기
     * 
     * @param 모델번호
     *  :삭제전에 모델번호에 해당하는 정보가 있는지를 찾고 없으면
     *     SearchNotFoundException 예외발생
     *     있으면 전자제품 모델번호에 해당하는 정보를 삭제한다.
     */
    public void delete(int modelNo) throws SearchNotFoundException;
    
    /**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
    public List<Electronics> selectSortByPrice() ;

    
    // 추가기능
    
    /**
     * 1. 세일기능
     * 지정된 modelNo에 입력받은 (int)% 만큼 할인 적용. 100을 초과하거나 0보다 작거나 같으면 DiscountBoundsException 발생     * 
     */
    public void updateDiscount(int modelNo, int discountPercent) throws DiscountBoundsException, SearchNotFoundException;
    
    /**
     * 2. 모델이름검색 기능
     * modelName 에 해당하는 모든 상품 리턴. 이름에 해당하는 모델 없을 시에 SearchNotFoundException 발생
     */
    public List<Electronics> searchModelName(String ModelName) throws SearchNotFoundException;
}



