function crash(){
	setTimeout(crash, 1);
	// oh this also spams the console
	console.log('crash');
	console.log('do it');
}
