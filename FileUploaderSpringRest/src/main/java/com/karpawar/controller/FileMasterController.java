package com.karpawar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.karpawar.entity.FileMaster;
import com.karpawar.repository.FileMasterRepository;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/filemaster")
public class FileMasterController {

	Map<String, String> respMap = new HashMap<String, String>();

	@Autowired
	FileMasterRepository fileMasterRepository;

	@RequestMapping("create")
	public Map<String, String> create(@RequestBody FileMaster mstTitle) {
		if (mstTitle.getTitleName() != null) {
			fileMasterRepository.save(mstTitle);
			respMap.put("success", "1");
			respMap.put("msg", "Added Successfully");
			return respMap;
		} else {
			respMap.put("success", "0");
			respMap.put("msg", "Failed To Add Null Field");
			return respMap;
		}
	}

}
