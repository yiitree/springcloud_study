package com.leyou.consumer.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    public User query(int id) {
//        String url = "http://localhost:8888/service/query" + id;
//        return restTemplate.getForObject(url, User.class);
//    }

//    @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
//    public User queryUserById(Long id){
//        long begin = System.currentTimeMillis();
//        String url = "http://user-service/user/" + id;
//        User user = this.restTemplate.getForObject(url, User.class);
//        long end = System.currentTimeMillis();
//        // 记录访问用时：
//        logger.info("访问用时：{}", end - begin);
//        return user;
//    }
//
//    public User queryUserByIdFallback(Long id){
//        User user = new User();
//        user.setId(id);
//        user.setName("用户信息查询出现异常！");
//        return user;
//    }

}
