<%@ include file="../header.jspf"%>

<div class="card p-2">
    <div class="title">
        <h2>Update Student</h2>
    </div>

    <div class="body">

        <form:form action="${pageContext.request.contextPath}/students/update" method="post" modelAttribute="student">
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

            <fieldset>
                    Debt <form:checkbox path="debt" value="Debt"/>
            </fieldset>

                <div>
                    <a type="button" href="${pageContext.request.contextPath}/students/">Back</a>
                    <button type="submit">Save</button>
                </div>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>