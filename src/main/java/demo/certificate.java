package demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class certificate {
 @Override
    public String toString() {
        return "certificate [course=" + course + ", duration=" + duration + "]";
    }
public certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }
public certificate() {
    }
private String course;
 private String duration;
public String getCourse() {
    return course;
}
public void setCourse(String course) {
    this.course = course;
}
public String getDuration() {
    return duration;
}
public void setDuration(String duration) {
    this.duration = duration;
}

}
