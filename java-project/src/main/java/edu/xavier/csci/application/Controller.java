package edu.xavier.csci.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

         System.out.println("Welcome ot the game!");

}


    @GetMapping("/decode")
    public Response add(@RequestBody input ) {

        ResponseSingleDecode r = new ResponseSingleDecode();
        r.getNumber(1);
        r.setNumber("numbers: " + input.getName());

        return r;
    }

    @GetMapping("/decode/{id}")

    public ResponseSingleDecode encode(@PathVariable("id") String num) {
        ResponseSingleDecode response = new ResponseSingleDecode();

        response.setNumber(romanNumeralConverter.decode(num));

        return response;
    }

    @GetMapping("/encode")
    public Response add(@RequestBody input ) {

        ResponseSingleEncode r = new ResponseSingleEncode();
        r.getRNumber("X");
        r.setRNumber("romanNumerals":  + input.getRName());

        return r;
    }


    @GetMapping("/encode/{number}")

    public ResponseSingleEncode decode(@PathVariable("number") Integer Rnum) {
        ResponseSingleEncode response = new ResponseSingleEncode();

        response.setRNumber(romanNumeralConverter.Encode(Rnum));

        return response;
    }