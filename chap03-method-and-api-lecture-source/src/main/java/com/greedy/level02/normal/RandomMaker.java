package com.greedy.level02.normal;

import com.ohgiraffers.section01.method.Calculator;

import java.util.Random;
import java.util.Scanner;

public class RandomMaker {



        public int randomNumber(int min, int max) {
            Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;

        }

//        public String randomUpperAlphabet(String length){
//
//            Random random1 = new Random();
//        String randomUpperAlphabet = random1.nextInt(length);
//          return randomUpperAlphabet;


    }





