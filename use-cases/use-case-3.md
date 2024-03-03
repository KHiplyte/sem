# USE CASE: 3 Produce a Report on the Salary of Employees in My Department

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *department manager* I want *to produce a report on the salary of employees in my department* so that *I can support financial reporting for my department.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

A report is available for the Department to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager.

### Trigger

A request for finance information is sent to the Department.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for a given role.
2. Department Manager captures name of the role to get salary information for.
3. Department Manager extracts current salary information of all employees of the given role.
4. Department Manager provides report to finance.

## EXTENSIONS

3. **Role does not exist**:
    1. Department Manager informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
