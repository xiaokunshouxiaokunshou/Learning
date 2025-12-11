package com.aj.RCS.controller;

import com.aj.RCS.pojo.AGV;
import com.aj.RCS.pojo.Result;
import com.aj.RCS.service.AGVService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
//@RequestMapping("/AGVS")
@RestController
public class AGVController {

    //private static final Logger log = LoggerFactory.getLogger(DeptController.class); //固定的

    @Autowired
    private AGVService agvService;

    /**
     * 查询列表
     */
    @RequestMapping("/AGVS")
    public Result list()
    {
        System.out.println("查询全部AGV");
        List<AGV> agvList = agvService.findAll();
        return Result.success(agvList);
    }

    /**
     * 删除 - 方式一: HttpServletRequest 获取请求参数
     */
    /*@DeleteMapping("/AGVS")
    public Result delete(HttpServletRequest request){
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);
        System.out.println("根据ID删除: " + id);
        return Result.success();
    }*/


    /**
     * 删除 - 方式二: @RequestParam
     * 注意事项: 一旦声明了@RequestParam, 该参数在请求时必须传递, 如果不传递将会报错. (默认 required 为 true)
     */
    /*@DeleteMapping("/AGVS")
    public Result delete(@RequestParam(value = "id", required = false) Integer id){
        System.out.println("根据ID删除: " + id);
        return Result.success();
    }*/

    /**
     * 删除 - 方式三: 省略@RequestParam (前端传递的请求参数名与服务端方法形参名一致) [推荐]
     */
    @DeleteMapping("/AGVS")
    public Result delete(Integer id){
        System.out.println("根据ID删除AGV:" + id);
        agvService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增AGV
     */
    @PostMapping("/AGVS")
    public Result add(@RequestBody AGV agv){
        System.out.println("新增AGV: " + agv);
        //log.info("新增:{}", agv);
        agvService.add(agv);
        return Result.success();
    }

    /**
     * 根据ID查询AGV
     */
    @GetMapping("/AGVS/{id}")
    public Result getInfo(@PathVariable("id") Integer agvId){
        System.out.println("根据ID查询AGV : " + agvId);
        AGV agv = agvService.getById(agvId);
        return Result.success(agv);
    }

    /**
     * 根据ID查询AGV
     */
//    @GetMapping("/{id}")
//    public Result getInfo(@PathVariable Integer id){
//        System.out.println("根据ID查询AGV : " + id);
//        //log.info("根据ID查询AGV: {}", id);
//        AGV agv = agvService.getById(id);
//        return Result.success(agv);
//    }

    /**
     * 修改
     */
    @PutMapping("/AGVS")
    public Result update(@RequestBody AGV agv){
        System.out.println("修改: " + agv);
        //log.info("修改:{}", agv);
        agvService.update(agv);
        return Result.success();
    }
}
