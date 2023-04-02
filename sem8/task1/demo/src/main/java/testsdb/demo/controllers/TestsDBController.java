package testsdb.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import testsdb.demo.models.Schedule;
import testsdb.demo.models.User;
import testsdb.demo.repo.ScheduleRepository;
import testsdb.demo.repo.StudentAnswerRepository;
import testsdb.demo.repo.UserRepository;

@RestController
public class TestsDBController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentAnswerRepository studentAnswerRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    
    @GetMapping("/teachers")
    public ResponseEntity<List<User>> getTeachers(){
        return ResponseEntity.ok(this.userRepository.findAllByRoleId(2L));
    }
    @GetMapping("/students")
    public ResponseEntity<List<User>> getStudents(){
        return ResponseEntity.ok(this.userRepository.findAllByRoleId(1L));        
    }

    @GetMapping("/tests")
    public ResponseEntity<List<Schedule>> getTests(){
        return ResponseEntity.ok(this.scheduleRepository.findAllByUserId( 2L));
    }        
    @GetMapping("/result")
    public ResponseEntity<List<Object[]>> getAnswers(){
        return ResponseEntity.ok(this.studentAnswerRepository.findAllResult());
    }
}
