var options = {
	onFail: function(){
		alert( '还有 '+$myform.getInvalid().length +' 个内容需要填写.' )
	},
	inputs: {
		'password': {
			filters: 'required pass',
		},
		'username': {
			filters: 'required username',
			data: {
			
			}
		},
		'file': {
			filters: 'extension',
			data: { extension: ['jpg'] }
		},
		'comments': {
			filters: 'min max',
			data: { min: 5, max: 50 }
		},
		'states': {
			filters: 'exclude',
			data: { exclude: ['default'] },
			errors : {
				exclude: '请选择省份.'
			}
		},
		'langs[]': {
			filters: 'min max',
			data: { min: 2, max: 3 },
			errors: {
				min: '至少选择 <strong>2</strong> 个喜爱的身份.',
				max: '最多只能选择 <strong>3</strong> 个喜爱的身份.'
			}
		}
	}

};

var $myform = $('#my-form').idealforms(options).data('idealforms');

$('#reset').click(function(){
	$myform.reset().fresh().focusFirst()
});

$myform.focusFirst();