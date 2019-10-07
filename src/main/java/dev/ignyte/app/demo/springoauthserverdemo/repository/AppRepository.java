package dev.ignyte.app.demo.springoauthserverdemo.repository;

import dev.ignyte.app.demo.springoauthserverdemo.domain.App;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends CrudRepository<App, String> {
    App findByUsername(String username);
}
