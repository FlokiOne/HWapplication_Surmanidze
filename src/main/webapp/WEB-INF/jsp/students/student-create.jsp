<%@ include file="../header.jspf"%>

    <div>
        <div class="title">
            <h2>Add Student</h2>
        </div>

        <div class="body">
            <form:form action="${pageContext.request.contextPath}/students/save" method="post" modelAttribute="student">
                <form:hidden path="studentId" />
                <fieldset>
                    <form:label path="firstName">Name</form:label>
                    <form:input path="firstName" type="text" maxlength="40" required="required" />
                </fieldset>

                <fieldset>
                    <form:label path="lastName">Surname</form:label>
                    <form:input path="lastName" type="text" maxlength="40" required="required" />
                </fieldset>

                <fieldset>
                    <form:label path="course">Course</form:label>
                    <form:input path="course" type="number" maxlength="1" required="required" />
                </fieldset>

                <div>
                    <a type="button" href="${pageContext.request.contextPath}/students/">Back</a>
                    <button type="submit">Save</button>
                </div>
            </form:form>
        </div>
    </div>

</body>
</html>
