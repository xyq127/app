package com.app;

import com.app.entity.Training;
import com.app.entity.Volunteer;
import com.app.mapper.TrainingMapper;
import com.app.mapper.VolunteerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
public class MapperTest {

    @Autowired
    private VolunteerMapper volunteerMapper;

    @Autowired
    private TrainingMapper trainingMapper;


    @Test
    public void testInsert() {
        List<Volunteer> volunteers = volunteerMapper.selectList(null);

        volunteers.forEach(System.out::println);
    }

    @Test
    public void logicDelete() {

        int result = trainingMapper.deleteById(2);

        List<Training> trainings = trainingMapper.selectList(null);

        trainings.forEach(System.out::println);
    }

    @Test
    public void dateTest() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String strDate2 = "2019-02-18";
        try {
            System.out.println(simpleDateFormat.parse(strDate2));
        } catch (ParseException e) {
            e.printStackTrace();
        }


//        try {
//            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//
//            String strDate1 = "2019-02-18 13:58";
//            String strDate2 = "2019-02-18";
//
////            Date date1 = simpleDateFormat1.parse(strDate1);
////            System.out.println(date1);
////            Date date2 = simpleDateFormat1.parse(strDate2);
////            System.out.println(date2);
//
//        } catch (ParseException e) {
//
//            e.printStackTrace();
//
//        }
    }

}
