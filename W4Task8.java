package S3Workshop_4;

import java.util.HashSet;
import java.util.Set;

public class W4Task8 {

    Set<String> enrollStudents = new HashSet<>();

    boolean enorllStudent(String user, String course) {
        String enrollkey =  user + ":" + course;
        if(enrollStudents.contains(enrollkey)) {
            return false;
        }
        enrollStudents.add(enrollkey);
        return true;   }
}
