# SolidPrinciples
 Code explaining solid Principles violations and fixes

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


