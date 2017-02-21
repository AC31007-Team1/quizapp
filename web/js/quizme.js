/**
 * Created by Anthony on 14/02/2017.
 */

// might have to change so form increments an id when storing in database

var counter = 0;

function createQuestionForm() {
    // creates a form
    var form = document.createElement("form");
    form.setAttribute('method', 'post');
    form.setAttribute('name', 'question'+counter)
    form.setAttribute('action', 'SubmitQuestions'); // empty action until submit with jsp

    // creates an input for the user
    var que = document.createElement("input");
    que.type = "text";
    que.name = "question";
    que.setAttribute("placeholder", "Please enter a question");
    que.id = "question";

    // creates an input for the user
    var ansc = document.createElement("input");
    ansc.type = "text";
    ansc.name = "answerc";
    ansc.setAttribute("placeholder", "Please enter the correct answer to the question");
    ansc.id = "answerc";

    // adds above as child elements to form var
    form.appendChild(que);
    form.appendChild(ansc);

    // can change for loop '3' for number of incorrect questions to generate
    for(var i = 0; i < 3; i++) {

        // creates an input for the user
        var ansi = document.createElement("input");
        ansi.type = "text";
        ansi.name = "answeri" + [i];
        ansi.setAttribute("placeholder", "Please enter an incorrect answer");
        ansi.id = "answeri" + [i];

        form.appendChild(ansi);
    }

    // create a button for form
    var sb = document.createElement("input");
    sb.type = "submit";
    sb.val = "Submit";

    form.appendChild(sb);


    // add to body tag in html
    $("body").append(form);
    
    counter++;
}