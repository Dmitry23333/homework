package homework9.student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import homework9.comparator.FIOComparator;
import homework9.comparator.GradeComparator;
import homework9.random.GetRandom;

public class CreateStudents {
	public static List<Student> create(){
		return Stream.generate(() -> new Student(GetRandom.getSurname(),GetRandom.getFirstName(),
				GetRandom.getSecondName(),GetRandom.getGrade())).limit(10000).sorted(new GradeComparator().thenComparing(new FIOComparator())).collect(Collectors.toList());
	}

}
