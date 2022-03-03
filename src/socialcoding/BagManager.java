package socialcoding;

public class BagManager {

	public static Object[] itemBag = new Object[5];
	public static int itemBagsSize = 0;

	public void addItemToBag(Object element, boolean isBroken) {
		if (!isBroken) {
	
			if ( isFUllItemBag()) {
				increaseItemBagSize();
			}
	        addItemToBag(element);
		}
	}

	private void addItemToBag(Object element) {
		System.out.println("전체 가방사이즈는 " + BagManager.itemBag.length + "칸 입니다.");
		BagManager.itemBag[BagManager.itemBagsSize] = element;
		System.out.println(BagManager.itemBagsSize+1 + "번째 아이템으로 " + element + " 추가되었습니다.");
		BagManager.itemBagsSize++;
	}

	private void increaseItemBagSize() {
		Object[] newItemBag = new Object[BagManager.itemBag.length + 5];
		
		for (int i = 0; i < BagManager.itemBagsSize; i++) {
			newItemBag[i] = BagManager.itemBag[i];
			}
		
		System.out.println("가방 사이즈를 늘립니다.");
		BagManager.itemBag = newItemBag;
	}

	private boolean isFUllItemBag() {
		return BagManager.itemBagsSize + 1 > BagManager.itemBag.length;
	}

}
