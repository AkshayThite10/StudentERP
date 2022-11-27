function submitFunction() {
    // Getting values
    alert("Student has been registered!")
    console.log("Hitting");
    let branch = document.getElementById("branch").value;
    let photo = document.getElementById("photo").value;
    let name = document.getElementById("name").value;

    console.log(branch)
    console.log(photo)
    console.log(name)

    let obj = {
        branch: branch,
        photo: photo,
        name: name
    };

    console.log(obj)
    // Send to Backend
    fetch("/fullInt_war/api/student/add", {
        // Adding method type
        method: "POST",
        // Adding body or contents to send
        body: JSON.stringify(obj),
        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    })
        // Converting to JSON
        .then((response) => response.json())

        // Displaying results to console
        .then((json) => {
            console.log(json)

            // Popup
            Swal.fire({
                title: 'Submitted!',
                text: 'Details has been submitted',
                icon: 'success',
                confirmButtonText: 'Okay'
            })
        });

}
function imageUploaded(){
    var file = document.querySelector(
        'input[type=file]')['files'][0];

    var reader = new FileReader();
    console.log("next");

    reader.onload = function () {
        base64String = reader.result.replace("data:", "")
            .replace(/^.+,/, "");

        imageBase64Stringsep = base64String;

        // alert(imageBase64Stringsep);
        console.log(base64String);

    }
    reader.readAsDataURL(file);
}