package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication.FooFormatter;

@SpringBootApplication
public class DemoApplication {

public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
}


@Component("fooFormatter")
public class FooFormatter {
public String format() {
return "foo";
}
}

public class fooFormater{
	@Autowired
	private fooFormater fooFormater;

}

public class FooService {
    private FooFormatter fooFormatter;
    @Autowired
    public void setFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}




}

// public class FooService {
//     private FooFormatter fooFormatter;
//     @Autowired
//     public FooService(FooFormatter fooFormatter) {
//         this.fooFormatter = fooFormatter;
//     }
// }

