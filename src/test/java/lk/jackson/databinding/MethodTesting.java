package lk.jackson.databinding;

import lk.jackson.databinding.model.GetObject;
import lk.jackson.databinding.service.ServicesAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MethodTesting {

    @Autowired
    ServicesAPI service;

    @Test
    public void GetObjectTest() throws Exception {
        List<GetObject> list = service.getMethod();
        for (GetObject l : list) {
            System.out.println(l.getPage());
            System.out.println(l.getPer_page());
            System.out.println(l.getTotal());
            System.out.println(l.getTotal_page());
//            System.out.println(l.getData());
        }
    }
}
