package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import cn.bran.play.JapidController;

import models.*;

public class Application extends JapidController {

    public static void index() {
        render();
    }

}