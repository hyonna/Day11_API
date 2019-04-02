package com.lang.string.ex;

public class WeatherInit {

	private String info;

	public WeatherInit() {

		info = "seoul, 맑음, 10, 20, 0.3, daejeon, 비, -22, 50, 0.1, incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";

	}

	public Weather[] getWethers() {

		String[] infos = info.split(", ");

		Weather[] weathers = new Weather[infos.length / 5];

		int index = 0;

//		for (int i = 0; i < infos.length; i++) {
//			
//			Weather w = new Weather();
//		
//			w.setCity(infos[i]);
//			w.setState(infos[++i]);
//			w.setTem(infos[++i]);
//			w.setHum(infos[++i]);
//			w.setMise(infos[++i]);
//			
//			weathers[index] = w;
//			index++;
//		
//		}

		
		for (int i = 0; i < infos.length; i=i+5) {

			Weather w = new Weather();

			w.setCity(infos[i]);
			w.setState(infos[i+1]);
			w.setTem(infos[i+2]);
			w.setHum(infos[i+3]);
			w.setMise(infos[i+4]);

			weathers[i/5] = w;
			

		}

		return weathers;
		
	}
	
	

}
