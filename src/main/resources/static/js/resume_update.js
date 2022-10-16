
let companychecktag = 1;
let agree = false;

function ckCheck(num) {
   if ($("input:checkbox[name=item_name" + num + "]").is(":checked")) {
      alert("동의하셨습니다");
   } else {
      alert("동의해주세요");
   }
}

function validation() {

   var checkbox = $(":checkbox[value='Y']");

   for (var i = 0; i < checkbox.length; i++) {

      var $this = $(checkbox[i]);

      if (!$this.is(":checked")) {
         alert('약관에 동의하지 않을 경우 가입할 수 없습니다.');
         $this.focus();
         return false;
      }
   }
   return true;
}

function ckCheck() {
   $("input:checkbox[name='item_name1']").each(function() {
      if ($(this).is(":checked") == true) {
         agree = true;
      }
      if ($(this).is(":checked") == false) {
         agree = false;
      }
   });
}
