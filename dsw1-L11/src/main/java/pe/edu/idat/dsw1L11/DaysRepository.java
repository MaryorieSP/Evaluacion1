package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DaysRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("Lunes");
		lunes.setTraduccion("Monday");

		countries.put(lunes.getName(), lunes);

		Country martes = new Country();
		martes.setName("Martes");
		martes.setTraduccion("Tuesday");

		countries.put(martes.getName(), martes);

		Country mierco = new Country();
		mierco.setName("Miercoles");
		mierco.setTraduccion("Wednesday");

		countries.put(mierco.getName(), mierco);


        Country jueves = new Country();
		jueves.setName("Jueves");
		jueves.setTraduccion("Thursday");

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("Viernes");
		viernes.setTraduccion("Friday");

		countries.put(viernes.getName(), viernes);


		Country sabado = new Country();
		sabado.setName("Sabado");
		sabado.setTraduccion("Saturday");

		countries.put(sabado.getName(), sabado);


		Country domin = new Country();
		domin.setName("Domingo");
		domin.setTraduccion("Sunday");

		countries.put(domin.getName(), domin);

	}

	public Country findCountry(String name) {
		Assert.notNull(name, "Solo son 7 dias de la semana");
		return countries.get(name);
	}
}