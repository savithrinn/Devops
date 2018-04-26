
 body_msg = ''' Jenkins Job success

'''+"$JOB_URL"+'''
Thanks
Jenkins
'''
mail bcc: '', body: body_msg, cc: '', from: '', replyTo: '', subject: 'Job Success', to: 'hari.kammana@gmail.com'
