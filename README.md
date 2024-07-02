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
<img width="1410" alt="Screenshot 2024-07-02 at 11 40 26 AM" src="https://github.com/AnilDeshpande/SolidPrinciples/assets/7361268/c73ec9b7-8605-443d-b4cf-6bec871083fe">

#### The Class  relation ship diagram.  
<img width="1430" alt="Screenshot 2024-07-02 at 11 41 39 AM" src="https://github.com/AnilDeshpande/SolidPrinciples/assets/7361268/6463a833-9b6f-4cd0-8a20-e9396547b4c5">

