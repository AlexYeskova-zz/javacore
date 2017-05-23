package com.yeskova.runners.lesson17;

import com.sun.tools.javac.code.Attribute;
import com.yeskova.app.classwork.lesson17.Season;

import java.util.Arrays;

/**
 * Created by Alex on 5/16/17.
 */
public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        if(season == Season.SPRING){
            season = Season.SUMMER;
        }
        System.out.println(season.name());
        System.out.println(Season.AUTUMN.name() );
        Season season1 = season.valueOf("SPRING");
        System.out.println(Arrays.toString(Season.values() ));

    }}
