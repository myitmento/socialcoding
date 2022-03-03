package socialcoding;

public class GameClient {

	public static void main(String[] args) {

    	System.out.println("게임 아이템 수집을 시작합니다!");
    	BagManager bagManager = new BagManager();
    	
    	bagManager.addItemToBag("물약",false);
    	bagManager.addItemToBag("단검",true);
    	bagManager.addItemToBag("장총",false);
    	bagManager.addItemToBag("가위",true);
    	bagManager.addItemToBag("안경",false);
    	bagManager.addItemToBag("돋보기",true);
    	bagManager.addItemToBag("탱크",true);
    	bagManager.addItemToBag("자전거",true);
    	bagManager.addItemToBag("풀",false);
    	bagManager.addItemToBag("노트",false);
    	bagManager.addItemToBag("바람개비",false);
    	bagManager.addItemToBag("후레쉬",true);
    	bagManager.addItemToBag("장검",false);
    	bagManager.addItemToBag("망또",false);
    	bagManager.addItemToBag("스프레이",false);

    	System.out.println("게임 아이템 수집을 종료합니다.!");
    }
}
