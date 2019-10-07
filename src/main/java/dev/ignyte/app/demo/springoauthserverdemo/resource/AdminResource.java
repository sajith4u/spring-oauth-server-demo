package dev.ignyte.app.demo.springoauthserverdemo.resource;

import dev.ignyte.app.demo.springoauthserverdemo.domain.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdminResource {

    @GetMapping("/admin/details")
    public List<Admin> admins() {
        List<Admin> admins = new ArrayList<>();
        Admin admin = new Admin();
        admin.setId("001");
        admin.setName("Test Admin 001");

        Admin admin1 = new Admin();
        admin1.setId("002");
        admin1.setName("Test Admin 002");

        admins.add(admin);
        admins.add(admin1);
        return admins;
    }

    @GetMapping("/admin/details/{id}")
    public Admin user(@PathVariable("id") String id) {
        Admin admin = new Admin();
        admin.setId(id);
        admin.setName("Test Admin " + id);
        return admin;
    }

}
