package com.enter.core;

import com.enter.core.pojo.dto.entity.CityDTO;
import com.enter.core.pojo.dto.entity.DistrictDTO;
import com.enter.core.pojo.entity.City;
import com.enter.core.pojo.entity.District;
import com.enter.core.service.CityService;
import com.enter.core.service.DistrictService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
	@Autowired
	private CityService cityService;
	@Autowired
	private DistrictService districtService;
	//测试地区管理的city
	//添加
	@Test
	public void test1() throws Exception {
		City city = new City();
		city.setName("湛江");
		city.setStatus(false);
		city.setPriority(30);
		cityService.insert(new CityDTO().convertToDTO(city));
	}
	//修改
	@Test
	public void test2(){
		City city = new City();
		city.setId(1);
		city.setName("深圳市");
		city.setStatus(true);
		city.setPriority(20);
		city.setCreateTime(new Date(2019-10-10));
		city.setLastUpdateTime(new Date(2019-10-11));
		city.setUsageCounter(300);
		cityService.updateByPrimary(new CityDTO().convertToDTO(city));
	}
	//删除
	@Test
	public void test3(){
		City city = new City();
		city.setId(2);
		cityService.deleteByPrimary(new CityDTO().convertToDTO(city));
	}
	//查询一条记录(有异常不影响)
	@Test
	public void test4(){
		City city = new City();
		city.setId(1);
		CityDTO cityDTO = cityService.selectByPrimary(new CityDTO().convertToDTO(city));
		System.out.println("cityDTO = " + cityDTO);
	}
	//查询所有记录
	@Test
	public void test5(){
		List<CityDTO> cityDTOS = cityService.selectAll();
		System.out.println("cityDTOS = " + cityDTOS);
	}

	//测试地区管理的district
	//添加
	@Test
	public void test6() throws Exception {
		District district = new District();
		district.setName("西区");
		district.setSchoolId(001);
		district.setStatus(true);
		district.setPriority(20);
		districtService.insert(new DistrictDTO().convertToDTO(district));
	}
	//修改
	@Test
	public void test7(){
		District district = new District();
		district.setId(3);
		district.setName("中区");
		district.setSchoolId(001);
		district.setStatus(false);
		district.setPriority(10);
		district.setCreateTime(new Date(2019-10-10));
		district.setLastUpdateTime(new Date(2019-10-11));
		districtService.updateByPrimary(new DistrictDTO().convertToDTO(district));
	}
	//删除
	@Test
	public void test8(){
		District district = new District();
		district.setId(2);
		districtService.deleteByPrimary(new DistrictDTO().convertToDTO(district));
	}
	//查询一条记录(有异常不影响)
	@Test
	public void test9(){
		District district = new District();
		district.setId(4);
		DistrictDTO districtDTO = districtService.selectByPrimary(new DistrictDTO().convertToDTO(district));
		String schoolName = districtService.selectSchoolNameById(2);
		System.out.println("schoolName = " + schoolName);
		System.out.println("districtDTO = " + districtDTO);
	}
	//查询所有记录
	@Test
	public void test10(){
		List<DistrictDTO> districtDTOS = districtService.selectAll();
		System.out.println("districtDTOS = " + districtDTOS);
	}
}
