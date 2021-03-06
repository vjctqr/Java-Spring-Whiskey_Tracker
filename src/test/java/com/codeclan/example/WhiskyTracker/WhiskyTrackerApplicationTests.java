package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {


	@Autowired
	WhiskyRepository whiskyRepository;
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskyByYear(){
		List<Whisky> found = whiskyRepository.findWhiskyByYear(1995);
		assertEquals(1995, found.get(0).getYear());
	}

	@Test
	public void canFindDistilleriesByRegion(){
		List<Distillery> foundDistilleries = distilleryRepository.findByRegion("Highland");
	}

//	@Test
//	public void canFindAllDistilleriesForAGivenRegion(){
//		Region foundRegion = distilleryRepository.getOne(1L);
//		List<Distillery> foundDistilleries = distilleryRepository.findByRegion(foundRegion)
//	}


}
