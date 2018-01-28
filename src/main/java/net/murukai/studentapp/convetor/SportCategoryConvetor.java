package net.murukai.studentapp.convetor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;

import net.murukai.stdrestapi.dao.SportDao;
import net.murukai.stdrestapi.dto.SportCategory;

public class SportCategoryConvetor extends PropertyEditorSupport{
	@Autowired
	private SportDao sportDao;
	
	@Override
    public void setAsText(String id)
    {
		System.out.println("inside property editor");
		System.out.println(id);
        SportCategory sportCategory = new SportCategory();
        sportCategory = sportDao.getCategory(Integer.valueOf(id));
        System.out.println(sportCategory);
        this.setValue(sportCategory);
    }
}
