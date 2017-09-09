package com.bingosoft.wechat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bingosoft.wechat.dto.ActivityGroupInputDto;
import com.bingosoft.wechat.dto.ActivityGroupOutputDto;
import com.bingosoft.wechat.dto.ActivityInfoOutputDto;
import com.bingosoft.wechat.dto.ActivityInputDto;
import com.bingosoft.wechat.dto.ActivityOutputDto;
import com.bingosoft.wechat.dto.AdOutputDto;
import com.bingosoft.wechat.dto.AdParamsInputDto;
import com.bingosoft.wechat.dto.CollectionActivityInputDto;
import com.bingosoft.wechat.dto.HotActivityInputDto;
import com.bingosoft.wechat.dto.HotActivityOutputDto;
import com.bingosoft.wechat.dto.UserActivityGroupOutput;
import com.bingosoft.wechat.dto.UserInfoOutputDto;
import com.bingosoft.wechat.modal.ApiResponse;
import com.bingosoft.wechat.modal.ApiResponseMsg;
import com.bingosoft.wechat.service.IUserInfoService;

import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;

@Api(value = "活动信息", description = "拼团活动API")
@RestController
@RequestMapping("/activity/api/v1")
public class ActivityController {
	
	@Autowired
    private IUserInfoService userInfoService;

	@ApiOperation(value = "获取轮播信息", notes = "获取轮播信息")
	@RequestMapping(value = "/getAdList", method = RequestMethod.POST)
	public ApiResponse<List<AdOutputDto>> getAdList(@RequestBody AdParamsInputDto inputDto) {
		return new ApiResponse<List<AdOutputDto>>(200, true, "获取成功", null);
	}
	
	@ApiOperation(value = "获取用户信息", notes = "获取用户信息")
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
	public ApiResponse<UserInfoOutputDto> getUserInfo(){
		return new ApiResponse<UserInfoOutputDto>(200, true, "获取成功", null);
		
	}
	
	@ApiOperation(value = "用户参加拼团", notes = "用户参加拼团")
	@RequestMapping(value = "/addActivityGroup", method = RequestMethod.POST)
	public ApiResponseMsg addActivityGroup(@RequestBody ActivityGroupInputDto input){
		return new ApiResponseMsg(200, true, "参加成功");
		
	}
	
	@ApiOperation(value = "收藏活动", notes = "收藏活动")
	@RequestMapping(value = "/addCollectionActivity", method = RequestMethod.POST)
	public ApiResponseMsg addCollectionActivity(@RequestBody CollectionActivityInputDto input){
		return new ApiResponseMsg(200, true, "收藏成功");
		
	}
	
	@ApiOperation(value = "创建活动团", notes = "创建活动团")
	@RequestMapping(value = "/createActivityGroup", method = RequestMethod.POST)
	public ApiResponseMsg createActivityGroup(@RequestBody CollectionActivityInputDto input){
		return new ApiResponseMsg(200, true, "创建成功");
		
	}
	
	@ApiOperation(value = "获取一个活动的拼团信息", notes = "获取一个活动的拼团信息")
	@RequestMapping(value = "/getActivityGroupList", method = RequestMethod.POST)
	public ApiResponse<ActivityGroupOutputDto> getActivityGroupList(@RequestBody CollectionActivityInputDto input){
		return new ApiResponse<ActivityGroupOutputDto>(200, true, "创建成功",null);
		
	}
	
	@ApiOperation(value = "获取活动信息", notes = "获取活动信息")
	@RequestMapping(value = "/getActivityInfo", method = RequestMethod.POST)
	public ApiResponse<ActivityInfoOutputDto> getActivityInfo(@RequestBody CollectionActivityInputDto input){
		return new ApiResponse<ActivityInfoOutputDto>(200, true, "创建成功",null);
		
	}
	
	@ApiOperation(value = "获取活动信息", notes = "获取活动信息")
	@RequestMapping(value = "/getHotActivityList", method = RequestMethod.POST)
	public ApiResponse<List<HotActivityOutputDto>> getHotActivityList(@RequestBody HotActivityInputDto input){
		return new ApiResponse<List<HotActivityOutputDto>>(200, true, "创建成功",null);
		
	}
	
	@ApiOperation(value = "活动查询", notes = "活动查询")
	@RequestMapping(value = "/queryActivityList", method = RequestMethod.POST)
	public ApiResponse<List<ActivityOutputDto>> queryActivityList(@RequestBody ActivityInputDto input){
		return new ApiResponse<List<ActivityOutputDto>>(200, true, "创建成功",null);
		
	}
	
	@ApiOperation(value = "活动查询", notes = "活动查询")
	@RequestMapping(value = "/queryUserActivityGroup", method = RequestMethod.POST)
	public ApiResponse<List<UserActivityGroupOutput>> queryUserActivityGroup(@RequestBody ActivityInputDto input){
		return new ApiResponse<List<UserActivityGroupOutput>>(200, true, "创建成功",null);
		
	}
}
