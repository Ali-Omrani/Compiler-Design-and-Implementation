main:
move $t4, $gp
move $t2, $sp
li $t5, 0
#allocating buffer for actor
addiu $sp, $sp,-64
#end of allocating buffer for actor
#allocating space for actor unread count
li $a0,0
sw $a0, 0($gp)
addiu $gp, $gp, 4
#end of allocating space for actor unread count
#allocating buffer for actor
addiu $sp, $sp,-48
#end of allocating buffer for actor
#allocating space for actor unread count
li $a0,0
sw $a0, 0($gp)
addiu $gp, $gp, 4
#end of allocating space for actor unread count
move $t3, $sp
addiu $sp, $sp,-800
move $fp, $sp
#adding init message for actor0
li $a0, 0
li $a2, -1
mul $a0, $a0, $a2
add $a0, $a0, $t2
li $a1,0
sw $a1, 0($a0)
li $a1,0
sw $a1, -4($a0)
move $a1, $t5
add $a1, $a1, $gp
sw $a1, -8($sp)
sw $a1, -12($sp)
lw $a1, 0($t4)
addi $a1, $a1, 1
sw $a1, 0($t4)
#end of adding init message for actor0
mainloop:
li $t7,1
j a0
enda0:
j a1
enda1:
li $t6,1
beq $t7, $t6, progend
j mainloop
a0:
lw $a0, 0($t4)
beqz $a0 enda0
li $t7, 0
addi $a0, -1
sw $a0, 0($t4)
li $a0, 0
li $a2, -1
mul $a0, $a0, $a2
add $a0, $a0, $t2
addi $a0, $a0, -4
move $a1, $a0
addi $a1, $a1, -4
move $a2, $a1
addi $a2, $a2, -4
lw $a1, 0($a1)
lw $a2, 0($a2)
argcondition0:
beq $a1, $a2, argend0
addi $a2, $a2, -4
lw $a3, 0($a2)
sw $a3, 0($sp)
addi $sp, $sp, -4
j argcondition0
argend0:
add $a1, $a0, 4
lw $a0, 0($a0)
lw $a2,-16($a1)
sw $a2,0($a1)
lw $a2,-12($a1)
sw $a2,4($a1)
lw $a2,-8($a1)
sw $a2,8($a1)
lw $a2,-4($a1)
sw $a2,12($a1)
lw $a2,-32($a1)
sw $a2,-16($a1)
lw $a2,-28($a1)
sw $a2,-12($a1)
lw $a2,-24($a1)
sw $a2,-8($a1)
lw $a2,-20($a1)
sw $a2,-4($a1)
lw $a2,-48($a1)
sw $a2,-32($a1)
lw $a2,-44($a1)
sw $a2,-28($a1)
lw $a2,-40($a1)
sw $a2,-24($a1)
lw $a2,-36($a1)
sw $a2,-20($a1)
li $a1,0
beq $a0, $a1, r0
li $a1,1
beq $a0, $a1, r1
li $a1,2
beq $a0, $a1, r2
a1:
lw $a0, 4($t4)
beqz $a0 enda1
li $t7, 0
addi $a0, -1
sw $a0, 4($t4)
li $a0, 64
li $a2, -1
mul $a0, $a0, $a2
add $a0, $a0, $t2
addi $a0, $a0, -4
move $a1, $a0
addi $a1, $a1, -4
move $a2, $a1
addi $a2, $a2, -4
lw $a1, 0($a1)
lw $a2, 0($a2)
argcondition1:
beq $a1, $a2, argend1
addi $a2, $a2, -4
lw $a3, 0($a2)
sw $a3, 0($sp)
addi $sp, $sp, -4
j argcondition1
argend1:
add $a1, $a0, 4
lw $a0, 0($a0)
lw $a2,-16($a1)
sw $a2,0($a1)
lw $a2,-12($a1)
sw $a2,4($a1)
lw $a2,-8($a1)
sw $a2,8($a1)
lw $a2,-4($a1)
sw $a2,12($a1)
lw $a2,-32($a1)
sw $a2,-16($a1)
lw $a2,-28($a1)
sw $a2,-12($a1)
lw $a2,-24($a1)
sw $a2,-8($a1)
lw $a2,-20($a1)
sw $a2,-4($a1)
li $a1,0
beq $a0, $a1, r0
li $a1,1
beq $a0, $a1, r1
li $a1,2
beq $a0, $a1, r2
#begining scope0
#begining scope0
#start adding label
r0:
#end adding label
#begining scope0
# adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#start sending message
lw $a1, 0($t4)
li $a3, 4
beq $a1, $a3, ActorBufferError8
mul $a1, $a1, 16
addi $a1, $a1,0
li $a2, -1
mul $a1, $a1, $a2
li $a0,0
add $a2, $a1, $t2
sw $a0, 0($a2)
li $a0,1
sub $a2, $a2, 4
sw $a0, 0($a2)
move $a0, $t5
add $a0, $a0, $gp
sub $a2, $a2, 4
sw $a0, 0($a2)
lw $a0, 4($sp)
add $a1, $t5, $gp
sw $a0, 0($a1)
addi $t5, $t5, 4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a0, 4($sp)
add $a1, $t5, $gp
sw $a0, 0($a1)
addi $t5, $t5, 4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
add $a0, $t5, $gp
sub $a2, $a2, 4
sw $a0, 0($a2)
lw $a1, 0($t4)
addi $a1, $a1, 1
sw $a1, 0($t4)
j, endsendmessage8
ActorBufferError8:
li $a0,'A'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'c'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'t'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'B'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'u'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'e'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'O'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'v'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'e'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'l'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'w'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'E'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
#end of sending message
endsendmessage8:
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
j enda0
#start adding label
r1:
#end adding label
#begining scope0
# ----------- adding local array b--------------
# adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ------------ end of adding local array b --------------
# start of adding address to stack
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#start of assign array
lw $a1, 16($sp)
lw $a0, 4($sp)
sw $a0, -8($a1)
lw $a0, 8($sp)
sw $a0, -4($a1)
lw $a0, 12($sp)
sw $a0, 0($a1)
lw $a2, 12($sp)
sw $a2, 16($sp)
lw $a2, 8($sp)
sw $a2, 12($sp)
lw $a2, 4($sp)
sw $a2, 8($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#end of assign array
# ----------- adding local array g--------------
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ------------ end of adding local array g --------------
# start of adding address to stack
addiu $a0, $fp, -20
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 'a'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'b'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'c'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'd'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'e'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#start of assign array
lw $a1, 24($sp)
lw $a0, 4($sp)
sw $a0, -16($a1)
lw $a0, 8($sp)
sw $a0, -12($a1)
lw $a0, 12($sp)
sw $a0, -8($a1)
lw $a0, 16($sp)
sw $a0, -4($a1)
lw $a0, 20($sp)
sw $a0, 0($a1)
lw $a2, 20($sp)
sw $a2, 24($sp)
lw $a2, 16($sp)
sw $a2, 20($sp)
lw $a2, 12($sp)
sw $a2, 16($sp)
lw $a2, 8($sp)
sw $a2, 12($sp)
lw $a2, 4($sp)
sw $a2, 8($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#end of assign array
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -20($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -24($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -28($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -32($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -36($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
# writing String/Char
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#------------start checking index bound---------------
lw $a0, 4($sp)
li $a1, 3
slt $a0, $a0, $a1
beqz $a0, IndexOutOfBoundError
#--------------end checking index bound---------------
#start of right array access
li $a1,-8
add $a1, $a1, $fp
#start of finding array access addr
li $a2, 0
lw $a0, 4($sp)
add $a2, $a2, $a0
# pop stack
addiu $sp, $sp, 4
# end of pop stack
li $t1, 4
mul $a2, $a2, $t1
sub $a2, $a1, $a2
sw $a2, 0($sp)
addiu $sp, $sp, -4
# end of finding array access address
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding variable to stack in right array access
lw $a0, 0($a2)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# end of right array access
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#------------start checking index bound---------------
lw $a0, 4($sp)
li $a1, 3
slt $a0, $a0, $a1
beqz $a0, IndexOutOfBoundError
#--------------end checking index bound---------------
#start of right array access
li $a1,-8
add $a1, $a1, $fp
#start of finding array access addr
li $a2, 0
lw $a0, 4($sp)
add $a2, $a2, $a0
# pop stack
addiu $sp, $sp, 4
# end of pop stack
li $t1, 4
mul $a2, $a2, $t1
sub $a2, $a1, $a2
sw $a2, 0($sp)
addiu $sp, $sp, -4
# end of finding array access address
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding variable to stack in right array access
lw $a0, 0($a2)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# end of right array access
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#------------start checking index bound---------------
lw $a0, 4($sp)
li $a1, 3
slt $a0, $a0, $a1
beqz $a0, IndexOutOfBoundError
#--------------end checking index bound---------------
#start of right array access
li $a1,-8
add $a1, $a1, $fp
#start of finding array access addr
li $a2, 0
lw $a0, 4($sp)
add $a2, $a2, $a0
# pop stack
addiu $sp, $sp, 4
# end of pop stack
li $t1, 4
mul $a2, $a2, $t1
sub $a2, $a1, $a2
sw $a2, 0($sp)
addiu $sp, $sp, -4
# end of finding array access address
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding variable to stack in right array access
lw $a0, 0($a2)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# end of right array access
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -20($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -24($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -28($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -32($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -36($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
#begining scope40
# start of adding address to stack
addiu $a0, $fp, -40
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 20
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#--------init for--------
#----------------copy to for stack------------
lw $a0, 28($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 24($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 20($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 16($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 12($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 8($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 4($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#----------------end copy to for stack------------
addiu $a0, $fp,-40
#arraySize = 28
lw $a1, 28 ($t3)
sw $a1, 0($a0)
#--------end init for--------
#start adding label
for21:
#end adding label
#start of forJz
lw $a0, 4($t3)
beqz $a0, endfor23
#end of forJz
#begining scope44
# start of adding variable to stack
lw $a0, -40($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing String/Char
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
li $t0, -44
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#----------foreachStep-----------
lw $a0, 4($t3)
addiu $a0, $a0, 4
addu $a0, $t3, $a0
lw $a0, 0($a0)
addiu $a1, $fp,-40
sw $a0, 0($a1)
lw $a0, 4($t3)
addiu $a0, $a0, -4
sw $a0, 4($t3)
#start of jump
j, for21
#end of jump
li $t0, -40
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#start adding label
endfor23:
#end adding label
# -----------poping for data------------
# pop array size from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop array from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from real stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -20($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -24($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -28($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -32($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -36($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
# writing String/Char
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, '-'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
#begining scope40
# start of adding address to stack
addiu $a0, $fp, -40
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#--------init for--------
#----------------copy to for stack------------
lw $a0, 20($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 16($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 12($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 8($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 4($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#----------------end copy to for stack------------
addiu $a0, $fp,-40
#arraySize = 20
lw $a1, 20 ($t3)
sw $a1, 0($a0)
#--------end init for--------
#start adding label
for27:
#end adding label
#start of forJz
lw $a0, 4($t3)
beqz $a0, endfor29
#end of forJz
#begining scope44
# start of adding variable to stack
lw $a0, -40($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
li $t0, -44
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#----------foreachStep-----------
lw $a0, 4($t3)
addiu $a0, $a0, 4
addu $a0, $t3, $a0
lw $a0, 0($a0)
addiu $a1, $fp,-40
sw $a0, 0($a1)
lw $a0, 4($t3)
addiu $a0, $a0, -4
sw $a0, 4($t3)
#start of jump
j, for27
#end of jump
li $t0, -40
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#start adding label
endfor29:
#end adding label
# -----------poping for data------------
# pop array size from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop array from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from real stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#start sending message
lw $a1, 4($t4)
li $a3, 3
beq $a1, $a3, ActorBufferError30
mul $a1, $a1, 16
addi $a1, $a1,64
li $a2, -1
mul $a1, $a1, $a2
li $a0,1
add $a2, $a1, $t2
sw $a0, 0($a2)
li $a0,2
sub $a2, $a2, 4
sw $a0, 0($a2)
move $a0, $t5
add $a0, $a0, $gp
sub $a2, $a2, 4
sw $a0, 0($a2)
add $a0, $t5, $gp
sub $a2, $a2, 4
sw $a0, 0($a2)
lw $a1, 4($t4)
addi $a1, $a1, 1
sw $a1, 4($t4)
j, endsendmessage30
ActorBufferError30:
li $a0,'A'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'c'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'t'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'B'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'u'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'e'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'O'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'v'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'e'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'l'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'w'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'E'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
#end of sending message
endsendmessage30:
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
j enda0
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#begining scope0
#start adding label
r2:
#end adding label
#begining scope0
# adding a number to stack
li $a0, 'g'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'i'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'n'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'g'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 't'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'w'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'r'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'i'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 't'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'e'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'i'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'n'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'l'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'p'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 88($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 84($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 80($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 76($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 72($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 68($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 64($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 60($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 56($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 52($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 48($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 44($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 40($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 4
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, 0($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
#begining scope16
# start of adding address to stack
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#--------init for--------
#----------------copy to for stack------------
lw $a0, 16($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 12($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 8($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 4($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#----------------end copy to for stack------------
addiu $a0, $fp,-16
#arraySize = 16
lw $a1, 16 ($t3)
sw $a1, 0($a0)
#--------end init for--------
#start adding label
for38:
#end adding label
#start of forJz
lw $a0, 4($t3)
beqz $a0, endfor43
#end of forJz
#begining scope20
# adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# ---------------RValue array pushing to stack------
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ---------------end of RValue array pushing to stack------
#begining scope20
# start of adding address to stack
addiu $a0, $fp, -20
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# adding a number to stack
li $a0, 8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
#--------init for--------
#----------------copy to for stack------------
lw $a0, 16($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 12($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 8($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
lw $a0, 4($sp)
sw $a0, 0($t3)
addiu $t3, $t3, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#----------------end copy to for stack------------
addiu $a0, $fp,-20
#arraySize = 16
lw $a1, 16 ($t3)
sw $a1, 0($a0)
#--------end init for--------
#start adding label
for39:
#end adding label
#start of forJz
lw $a0, 4($t3)
beqz $a0, endfor42
#end of forJz
#begining scope24
# start of adding variable to stack
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
# start of adding variable to stack
lw $a0, -20($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing int
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing int
li $t0, -24
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#----------foreachStep-----------
lw $a0, 4($t3)
addiu $a0, $a0, 4
addu $a0, $t3, $a0
lw $a0, 0($a0)
addiu $a1, $fp,-20
sw $a0, 0($a1)
lw $a0, 4($t3)
addiu $a0, $a0, -4
sw $a0, 4($t3)
#start of jump
j, for39
#end of jump
li $t0, -20
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#start adding label
endfor42:
#end adding label
# -----------poping for data------------
# pop array size from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop array from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from real stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
li $t0, -20
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#----------foreachStep-----------
lw $a0, 4($t3)
addiu $a0, $a0, 4
addu $a0, $t3, $a0
lw $a0, 0($a0)
addiu $a1, $fp,-16
sw $a0, 0($a1)
lw $a0, 4($t3)
addiu $a0, $a0, -4
sw $a0, 4($t3)
#start of jump
j, for38
#end of jump
li $t0, -16
add $t0, $fp, $t0
move $sp, $t0
#ending scope
#start adding label
endfor43:
#end adding label
# -----------poping for data------------
# pop array size from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop array from for stack
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
#------------popping for stack----------
addiu $t3, $t3, 4
#------------end popping for stack----------
# pop element from real stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# adding a number to stack
li $a0, 'e'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'n'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'd'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'f'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'w'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'r'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'i'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 't'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'e'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'i'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'n'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, ' '
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'l'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'o'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# adding a number to stack
li $a0, 'p'
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding a number to stack
# writing String/Char
lw $a0, 80($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 76($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 72($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 68($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 64($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 60($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 56($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 52($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 48($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 44($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 40($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing String/Char
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
j enda1
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
li $t0, 0
add $t0, $fp, $t0
move $sp, $t0
#ending scope
# start syscall 10
li $v0, 10
syscall
# end syscall
IndexOutOfBoundError:
#-----------------start writing error message----------
li $a0,'I'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'n'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'d'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'e'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'x'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'O'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'u'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'t'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'O'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'f'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'B'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'u'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'n'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'d'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'E'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'o'
# start syscall 11
li $v0, 11
syscall
# end syscall
li $a0,'r'
# start syscall 11
li $v0, 11
syscall
# end syscall
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
j, progend
#-----------------end writing error message----------
progend:
li $v0, 10
syscall
