-- 写一个SQL，提取每个班级每个课程前3名
SELECT
    t1.class_id,
    t1.course_name,
    t1.student_id,
    t1.score
FROM
    student_course_score t1
WHERE
    (SELECT COUNT(DISTINCT t2.score)
     FROM student_course_score t2
     WHERE t2.class_id = t1.class_id
       AND t2.course_name = t1.course_name
       AND t2.score > t1.score) < 3
ORDER BY
    t1.class_id, t1.course_name, t1.score DESC;

-- 核心逻辑：
-- 对每条记录t1，子查询统计同一班级和课程中比t1.score高的不同分数数量。
-- 若该数量 < 3，则t1属于前 3 名（包括并列情况），结果按相同规则排序。