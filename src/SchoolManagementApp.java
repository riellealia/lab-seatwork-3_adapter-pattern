interface SchoolManagementApp {
    void integrateSystem();
}

class AttendanceSystem {
    public void markAttendance() {
        System.out.println("Attendance system integrated: attendance marked.");
    }
}

class GradingSystem {
    public void recordGrades() {
        System.out.println("Grading system integrated: grades recorded.");
    }
}

class LibrarySystem {
    public void manageBooks() {
        System.out.println("Library system integrated: books managed.");
    }
}

class AttendanceSystemAdapter implements SchoolManagementApp {
    private final AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}

class GradingSystemAdapter implements SchoolManagementApp {
    private final GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}

class LibrarySystemAdapter implements SchoolManagementApp {
    private final LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}

class AdapterDemo {
    public static void main(String[] args) {
        SchoolManagementApp[] integratedSystems = {
            new AttendanceSystemAdapter(new AttendanceSystem()),
            new GradingSystemAdapter(new GradingSystem()),
            new LibrarySystemAdapter(new LibrarySystem())
        };

        for (SchoolManagementApp system : integratedSystems) {
            system.integrateSystem();
        }
    }
}