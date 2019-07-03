package com.greenplatform.controller;

import com.greenplatform.model.*;
import com.greenplatform.model.base.ReturnModel;
import com.greenplatform.service.PlateService;
import com.greenplatform.util.GetcurrentLoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Luowenlv on 2019/5/7,11:25
 */
@RestController
@RequestMapping(value = "/plate")
public class PlateController {

    @Autowired
    PlateService plateService;

    @PostMapping(value = "/getLoginUser")
    public ReturnModel getLoginUser(){
        ReturnModel returnModel = new ReturnModel();
        try{
            PlateUser plateUser = GetcurrentLoginUser.getCurrentUser();
            returnModel.setFlag(0);
            returnModel.setMsg("");
            returnModel.setObject(plateUser);
        }catch (Exception e){
            e.printStackTrace();
            returnModel.setFlag(1);
            returnModel.setMsg("获取登录用户信息失败，"+e);
            returnModel.setObject(null);
        }
        return returnModel;
    }

    @PostMapping(value = "/getDmmc")
    public ReturnModel getDmmc(String cDmlb,String cDm){
        ReturnModel returnModel = new ReturnModel();
        return returnModel;
    }

    @PostMapping(value = "/selectPlateuser")
    public ReturnModel selectPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.selectPlateuser(plateUser);
        return returnModel;
    }

    @PostMapping(value = "/selectWebUser")
    public ReturnModel selectWebUser(PlateUser plateUser){
        ReturnModel returnModel = plateService.selectWebUser(plateUser);
        return returnModel;
    }

    @PostMapping(value = "/insertPlateuser")
    public ReturnModel insertPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.insertPlateuser(plateUser);
        return returnModel;
    }

    @PostMapping(value = "/retsetPass")
    public ReturnModel retPass(PlateUser plateUser){
        ReturnModel returnModel = plateService.retsetPass(plateUser);
        return returnModel;
    }

    @PostMapping(value = "/updPlateuser")
    public ReturnModel updPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.updPlateuser(plateUser);
        return returnModel;
    }

    @PostMapping(value = "/delPlateuser")
    public ReturnModel delPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.delPlateuser(plateUser);
        return returnModel;
    }
    @PostMapping(value = "/selectPlateCodeDmz")
    public ReturnModel selectPlateCodeDmz(PlateCodeDmz plateCodeDmz){
        ReturnModel returnModel = plateService.selectPlateCodeDmz(plateCodeDmz);
        return returnModel;
    }

    @PostMapping(value = "/selectTGreenSpSpmx")
    public ReturnModel selectTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.selectTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @PostMapping(value = "/insertTGreenSpSpmx")
    public ReturnModel insertTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.insertTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @PostMapping(value = "/delTGreenSpSpmx")
    public ReturnModel delTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.delTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @PostMapping(value = "/updTGreenSpSpmx")
    public ReturnModel updTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.updTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @PostMapping(value = "/selectTGreenRwRwmx")
    public ReturnModel selectTGreenRwRwmx(@RequestParam("cUsername") String cUsername,
                                          @RequestParam("cRwlb") String cRwlb){
        Map paramsMap = new HashMap();
        paramsMap.put("cUsername",cUsername);
        paramsMap.put("cRwlb",cRwlb);
        ReturnModel returnModel = plateService.selectTGreenRwRwmx(paramsMap);
        return returnModel;
    }

    @PostMapping(value = "/insertYwjcdm")
    public ReturnModel insertYwjcdm(PlateCodeDmlb plateCodeDmlb,PlateCodeDmz plateCodeDmz){
        ReturnModel returnModel = plateService.insertYwjcdm(plateCodeDmlb,plateCodeDmz);
        return returnModel;
    }

    @PostMapping(value = "/selectYwjcdm")
    public ReturnModel selectYwjcdm(@RequestParam("cDmlb") String cDmlb,
                                    @RequestParam("cDm") String cDm){
        Map params = new HashMap();
        params.put("cDmlb",cDmlb);
        params.put("cDm",cDm);
        ReturnModel returnModel = plateService.selectPlateCodeDmz(params);
        return returnModel;
    }

    @PostMapping(value = "/updYwjcdm")
    public ReturnModel updYwjcdm(PlateCodeDmlb plateCodeDmlb,PlateCodeDmz plateCodeDmz){
        ReturnModel returnModel = plateService.updYwjcdm(plateCodeDmlb,plateCodeDmz);
        return returnModel;
    }

    @PostMapping(value = "/delYwjcdm")
    public ReturnModel delYwjcdm(PlateCodeDmz plateCodeDmz){
        ReturnModel returnModel = plateService.delPlateCodeDmz(plateCodeDmz);
        return returnModel;
    }


}
