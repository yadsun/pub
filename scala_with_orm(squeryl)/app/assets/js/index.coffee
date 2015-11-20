$ ->
  $.get("/userlist"), (users)->
  $.each users, (index, user)->
  $("#userlist").append $("<li>").text user.username