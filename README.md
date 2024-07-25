# SolidPrinciples
 Code explaining solid Principles violations and fixes

Here is the simplified text format to be pasted in a GitHub Markdown file:


# College System

## Departments
- **Academic Departments**: Manage courses and involve academic activities. Staff can work across different academic departments.
- **Non-Academic Departments**: Handle financial administration and related activities. Staff in these departments cannot work in academic departments.

## Staff
- **Academic Staff**: Engage in teaching, research work, managing coursework, etc.
- **Non-Academic Staff**: Handle financial administration like collecting fees and hostel fees.
- **Visiting Professors**: Visit twice a week, are paid per visit, and are not involved in regular academic work.

## Students
- **Undergraduate**:
  - Attributes: `name`, `age`, `date of birth`, `course name`, `department`, `current semester`
  - Duration: 4 years (8 semesters).
- **Post Graduate**:
  - Attributes: `name`, `age`, `date of birth`, `course name`, `department`, `current semester`
  - Duration: 2 years (4 semesters).
- **P.Hd Scholars**:
  - Attributes: `name`, `department`, `guide`, `joining date of PhD work`
  - Duration: Dynamic.
- **Post Doc Scholars**:
  - Attributes: `name`, `department`, `guide`, `joining date of PhD work`, `project name`
  - Duration: Unlimited.
- **Hostel Residents**:
  - Attributes: `local address (hostel address)`, `home address`, `hostel`, `block`, `room`
- **Day Scholars**:
  - Attributes: `home address`

## Courses
- **Undergraduate**:
  - Attributes: `name`, `tenure`, `department`
- **Post Graduate**:
  - Attributes: `name`, `tenure`, `department`
- **P.Hd**:
  - Attributes: `name of the PhD work`, `scholar name`, `guide name`, `start date`
- **Post Doc**:
  - Attributes: `name of the project`, `scholar name`, `guide name`, `start date`

## Engagement
- Academic and visiting staff can engage with students in various subjects.
- The system should track which subjects each staff member is qualified to teach and which students are enrolled in those subjects.

### UML diagram before Refactoring as per the SOLID principle started

<img width="1197" alt="Screenshot 2024-06-26 at 10 22 52 PM" src="https://github.com/AnilDeshpande/SolidPrinciples/assets/7361268/a3ac6e0c-8734-4495-8202-55b0cd77e685">

### UML diagram after Refactoring to make it compliant with Single Resposibility Principle - SRP
<img width="1312" alt="Screenshot 2024-06-27 at 10 35 54 PM" src="https://github.com/AnilDeshpande/SolidPrinciples/assets/7361268/8f246fe7-9ebb-4a5c-b5a2-a5fba7a8a36a">

### UML diagram after Refactoring to make it compliant with Open and Closed Principle - OCP
#### New Interfaces were created `SalaryCalculator` & `EngagementStrategy`. 
- Then there are concreate classes that implement these classes. 
 - `AcademicSalaryCalculator` & `VisitingSalaryCalculator` implement `SalaryCalculator`
 - `LectureEngagement` & `WorkShopEngagement` implement `SalaryCalculator`
<img width="1410" alt="Screenshot 2024-07-02 at 11 40 26 AM" src="https://github.com/AnilDeshpande/SolidPrinciples/blob/ocp-compliant/ClassHirachy.png">

#### The Class  relation ship diagram.  
<img width="1430" alt="Screenshot 2024-07-02 at 11 41 39 AM" src="https://github.com/AnilDeshpande/SolidPrinciples/blob/ocp-compliant/ClassDiagrams.png">
Based on the provided information, here are the total number of classes and interfaces:

### Classes
1. **College**
2. **AcademicDepartment** (extends Department)
3. **NonAcademicDepartment** (extends Department)
4. **UndergraduateStudent** (extends Student)
5. **PostGraduateStudent** (extends Student)
6. **PhdStudent** (extends Student)
7. **PostDocStudent** (extends Student)
8. **UndergraduateCourse** (extends Course)
9. **PostGraduateCourse** (extends Course)
10. **PhdCourse** (extends Course)
11. **PostDocCourse** (extends Course)
12. **AcademicStaff** (extends Staff)
13. **NonAcademicStaff** (extends Staff)
14. **VisitingStaff** (extends Staff)
15. **Address**
16. **WorkshopEngagement** (implements EngagementStrategy)
17. **LectureEngagement** (implements EngagementStrategy)
18. **StaffManager**
19. **EngagementManager**
20. **StudentManager**
21. **AcademicSalaryCalculator** (implements SalaryCalculator)
22. **VisitingSalaryCalculator** (implements SalaryCalculator)

### Interfaces
1. **SalaryCalculator**
2. **EngagementStrategy**

### Abstract Classes
1. **Department**
2. **Student**
3. **Course**
4. **Staff**

### Total
- **Classes**: 22
- **Interfaces**: 2
- **Abstract Classes**: 4

So, there are a total of **28 classes and interfaces** in the refactored code.

### UML diagram after Refactoring to make it compliant with Open and Closed Principle - OCP

# Class, Abstract Class, and Interface Summary
Total Number of classes, Abstract Classes and Interfaces - 32
## Classes
Total: 22
1. College
2. AcademicDepartment
3. NonAcademicDepartment
4. UndergraduateStudent
5. PostGraduateStudent
6. PhdStudent
7. PostDocStudent
8. AcademicStaff
9. NonAcademicStaff
10. VisitingStaff
11. UndergraduateCourse
12. PostGraduateCourse
13. PhdCourse
14. PostDocCourse
15. Address
16. EngagementManager
17. StaffManager
18. StudentManager
19. LectureEngagement
20. WorkshopEngagement
21. AcademicSalaryCalculator
22. VisitingSalaryCalculator

## Abstract Classes
Total: 4
1. Department
2. Student
3. Staff
4. Course

## Interfaces
Total: 6
1. CourseTypeProvider
2. SalaryReceiver
3. TenureProvider
4. DetailedAddress
5. EngagementStrategy
6. SalaryCalculator

