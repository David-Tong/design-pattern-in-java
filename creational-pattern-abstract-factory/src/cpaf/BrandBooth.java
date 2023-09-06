package cpaf;

public class BrandBooth {
	private Sedan sedan;
	private SUV suv;

	public static void main(String[] args) {
		BMWFactory bFactory = new BMWFactory();
		BrandBooth bmwBooth = new BrandBooth(bFactory);
		bmwBooth.showTime();
		
		TeslaFactory tFactory = new TeslaFactory();
		BrandBooth teslaBooth = new BrandBooth(tFactory);
		teslaBooth.showTime();
	}
	
	public BrandBooth(CarFactory factory) {
		this.sedan = factory.createSedan();
		this.suv = factory.createSUV();
	}
	
	public void showTime() {
		sedan.turnOnHeadLight();
		suv.turnOnHeadLight();
	}

}
