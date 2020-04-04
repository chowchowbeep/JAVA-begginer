create or replace FUNCTION GET_EMP_CNT(p_department_name VARCHAR2)
RETURN NUMBER
AS 
  v_cnt number :=0;

BEGIN
  select count(*)
  into v_cnt
  from employees e
  where e.DEPARTMENT_NAME = p_department_name;
  
  RETURN v_cnt; 
  
END GET_EMP_CNT;