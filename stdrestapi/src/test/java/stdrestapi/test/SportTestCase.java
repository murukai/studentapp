package stdrestapi.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.murukai.stdrestapi.dao.SportDao;
import net.murukai.stdrestapi.dto.SportCategory;
import net.murukai.stdrestapi.dto.SportEvent;

public class SportTestCase {
	private static AnnotationConfigApplicationContext context;
	private static SportDao sportDao;
	private SportCategory sportCategory;

	private SportEvent sportEvent;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.murukai.stdrestapi");
		context.refresh();
		sportDao = (SportDao) context.getBean("sportDao");
	}

	/*@Test
	public void testAdd() {
		sportCategory = sportDao.getCategory(1);

		sportEvent = new SportEvent();
		sportEvent.setName("District Soccer Tournament");
		sportEvent.setVenue("Mufakose 2 High");
		sportEvent.setTime("10-01-2018");
		sportEvent.setContactPersonName("T. Mboto");
		sportEvent.setContactPersonPhone("04-4899345");
		sportEvent.setContactPersonEmail("tmboto@gmail.com");
		sportEvent.setDescription("first district competition");
		sportEvent.setSportCategoryId(sportCategory.getId());

		assertEquals("Failed to add the Event!", true, sportDao.addSportEvent(sportEvent));

		sportCategory = sportDao.getCategory(1);

		sportEvent = new SportEvent();
		sportEvent.setName("District Soccer Tournament");
		sportEvent.setVenue("Mufakose 2 High");
		sportEvent.setTime("10-01-2018");
		sportEvent.setContactPersonName("T. Mboto");
		sportEvent.setContactPersonPhone("04-4899345");
		sportEvent.setContactPersonEmail("tmboto@gmail.com");
		sportEvent.setDescription("first district competition");
		sportEvent.setSportCategoryId(sportCategory.getId());

		assertEquals("Failed to add the Event!", true, sportDao.addSportEvent(sportEvent));
	}*/

	/*
	 * @Test public void testAddSportCategory(){ sportCategory = new
	 * SportCategory(); sportCategory.setName("Soccer");
	 * sportCategory.setDescription("These are sports played using balls");
	 * sportCategory.setSportingInstruments("FootBall, Football boots, Nets");
	 * 
	 * assertEquals("Failed to add the Category!", true,
	 * sportDao.addSportCategory(sportCategory));
	 * 
	 * sportCategory = new SportCategory(); sportCategory.setName("Netball");
	 * sportCategory.setDescription("These are sports played using balls");
	 * sportCategory.setSportingInstruments("NetBall, Netball boots, Nets");
	 * 
	 * assertEquals("Failed to add the Category!", true,
	 * sportDao.addSportCategory(sportCategory));
	 * 
	 * sportCategory = new SportCategory(); sportCategory.setName("Athletics");
	 * sportCategory.setDescription(
	 * "People compete again each other over speed.");
	 * sportCategory.setSportingInstruments("Sprinting spikes");
	 * 
	 * assertEquals("Failed to add the Category!", true,
	 * sportDao.addSportCategory(sportCategory)); }
	 */

	/*
	 * @Test public void testUpdateSport(){ sportEvent = sportDao.get(2);
	 * sportEvent.setContactPersonName("Mr. V. Mutazu"); sportCategory =
	 * sportDao.getCategory(1); sportCategory.setName("Soccer"); assertEquals(
	 * "Something went wrong updating sport event", true,
	 * sportDao.updateSportEvent(sportEvent)); assertEquals(
	 * "Something went wrong updating sport category", true,
	 * sportDao.updateSportCategory(sportCategory)); }
	 */
}
