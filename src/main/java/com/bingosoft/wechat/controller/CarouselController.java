package com.bingosoft.wechat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bingosoft.wechat.dto.CarouselOutputDto;
import com.bingosoft.wechat.modal.ApiResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "获取轮播信息", description = "获取轮播信息图片")
@RestController
@RequestMapping("/activity/api")
public class CarouselController {

	@ApiOperation(value = "获取轮播信息", notes = "获取轮播信息")
	@RequestMapping(value = "/getCarousel/{typeId}", method = RequestMethod.GET)
	public ApiResponse getCarousel(@PathVariable int typeId) {

		return new ApiResponse<List<CarouselOutputDto>>(200, true, "获取成功", null);
	}
}
