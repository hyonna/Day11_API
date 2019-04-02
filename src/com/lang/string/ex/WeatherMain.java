package com.lang.string.ex;

public class WeatherMain {

	public static void main(String[] args) {
		
		WeatherInit init = new WeatherInit();
		
		Weather[] weathers = init.getWethers();

		for(int i = 0; i < weathers.length; i++) {
			
			
			System.out.println("도시명 : " + weathers[i].getCity());
			System.out.println("상태 : " + weathers[i].getState());
			System.out.println("기온 : " + weathers[i].getTem());
			System.out.println("습도 : " + weathers[i].getHum());
			System.out.println("미세먼지 : " + weathers[i].getMise());
			System.out.println("==================================");
			
			
		}
		
	}

}
