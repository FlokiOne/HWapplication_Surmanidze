<%@ include file="../header.jspf"%>

    <div>
        <div class="title">
            <h2>Student INFO</h2>
        </div>

        <div>
            <div>
                <b>Name:</b> ${student.firstName}
            </div>
            <div>
                <b>Surname:</b> ${student.lastName}
            </div>
            <div>
                <b>Course:</b> ${student.course}
            </div>
            <div>
                <b>Debt:</b> ${student.debt}
            </div>

            <div>
                <a type="button" href="${pageContext.request.contextPath}/students/">Back</a>
                <a type="button" href="${pageContext.request.contextPath}/students/edit/${student.studentId}">Edit</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>