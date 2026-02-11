package ex0211.overring.goods;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods [] goodsArr = new Goods [10];
	public static int count;//0 배열방에 저장 객체의 개수 



   /**
      초기치 데이터를 세팅하는 메소드
	  String [][] data = new String [][]{
			 {"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
			 {"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
			 {"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
			 {"A04" , "허니버터칩" , "2200" , "달콤 하다."},
			 {"A05" , "콘칩" , "3000" , "고소하다."}
			 
		};
   */

   // 생성자 메소드
   public GoodsService(Goods[] goodsArr){
		for (int i = 0; i < goodsArr.length; i++) {
			this.goodsArr[i] = goodsArr[i];
		}
	   count = goodsArr.length;
   }

   public GoodsService(String[][] data) {
		this(toGoodsArr(data));
   }

   private static Goods[] toGoodsArr(String[][] data) {
	   Goods[] goodsArr = new Goods[data.length];
		for (int i = 0; i < data.length; i++) {
			goodsArr[i] = new Goods(data[i]);			
		}
	   return goodsArr;
   }





   /**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 상품코드 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
   */
   public InsertResponse insert(Goods goods){
	   // 배열의 길이 체크
	   if (count >= 10) {
		   return InsertResponse.OUT_OF_RANGE;		
	   }	  	   
	   //중복체크
	   if (this.selectByCode(goods.getCode()) != null) {
		   return InsertResponse.DUPULICATED;		
	   }
	   this.goodsArr[count] = goods;
	   count ++;
	   return InsertResponse.SUCCESS;
   }


   /**
     전체검색
   */
   public Goods[]  selectAll( ){	   
      return this.goodsArr;//
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
       for (int i = 0; i < count; i++) {
    	   Goods targetGoods = goodsArr[i]; 
    	   if (targetGoods.getCode().equals(code)) {
    		   return targetGoods;
    	   }
       }       
       return null;
   }


   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean update(Goods goods){ //수정하려는 코드, 변경값 - 가격, 설명
	   Goods targetGoods = this.selectByCode(goods.getCode()); 
       if (targetGoods != null) {
    	   targetGoods.setExplain(goods.getExplain());
    	   targetGoods.setPrice(goods.getPrice());
    	   return true;
       }
       return false;
   }
   
   /**
   상품코드에 해당하는 상품 삭제하기 
	@return : true이면 삭제완료, false이면 삭제실패
  */
   public boolean delete(String code) {
	   Goods targetGoods = this.selectByCode(code);
	   if (targetGoods != null) {
		   return true;
	   }
	   return false;
   }
   
}