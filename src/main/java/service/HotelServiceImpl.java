package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Hotel;

@Service
public class HotelServiceImpl implements HotelService{
	@Override
	public List<Hotel> getHoteles() {
		List<Hotel> hoteles = new ArrayList<Hotel>();
		Hotel reisCat = new Hotel(1, "Hostal dos reis católicos", "Praza do Obradoiro 1", "Santiago", "Galicia", "ola@hostalreis.com", "981585858", "hostel parador al lado de la catedral de Santiago",  100, 4.8, 125, (short) 5, false, false, true, true, true, false, false, true, 0);
		Hotel pazoDoCarme= new Hotel(2, "Palacio del Carmen", "Rúa do Carme de Abaixo 1", "Santiago", "Galicia", "ola@pazocarme.com", "981585857", "Hotel en un área céntrica de la ciudad", 100, 4.5, 65, (short) 5, false, false, true, true, true, false, false, true, 5);
		Hotel nhSantiago= new Hotel(3, "NH Santiago", "Parque da música 2", "Santiago", "Galicia", "ola@nhsantiago.com", "981586858", "hotel NH en el campus Norte", 500, 4.6, 50, (short) 4, true, false, true, true, true, false, false, true, 0);
		Hotel samos = new Hotel();
		hoteles.add(reisCat);
		hoteles.add(pazoDoCarme);
		hoteles.add(nhSantiago);
		hoteles.add(samos);
		return hoteles;
	}
}
