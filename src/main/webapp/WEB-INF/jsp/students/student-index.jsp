<%@ include file="../header.jspf"%>
<div>
    <div>
        <div class="title">
            <h2>Student LIST</h2>
        </div>
        <br/>
        <table>
            <thead>
            <tr>
                <th scope="colum">Name</th>
                <th scope="colum">Surname</th>
                <th scope="colum">Course</th>
                <th scope="colum">Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach  items="${students}" var ="student">
                <tr>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.course}</td>
                    <td>
                        <a type="button" href="${pageContext.request.contextPath}/students/${student.studentId}">Show</a>
                        <a type="button" href="${pageContext.request.contextPath}/students/edit/${student.studentId}">Edit</a>
                        <a type="button" href="${pageContext.request.contextPath}/students/delete/${student.studentId}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
        <a type="button" href="${pageContext.request.contextPath}/students/create">Add new student</a>
    </div>
</div>

</body>
</html>