#include <BehaviorTree.h>
#include <Intro.h>

void setup(){
	WorldState* state = new WorldState();
	Farrusco* f = new Farrusco();
	//BehaviorTree::ParallelNode* brain = new BehaviorTree::ParallelNode();
	BehaviorTree::StatusOverride* so0= new BehaviorTree::StatusOverride(2,0,0);
	BehaviorTree::PriorityNode* pr0 = new BehaviorTree::PriorityNode();
	BehaviorTree::SequentialNode* s1 = new BehaviorTree::SequentialNode();
	BehaviorTree::SequentialNode* s2 = new BehaviorTree::SequentialNode();
	SL::Behaviors::Bumper* rb3 = new SL::Behaviors::Bumper(true);
	SL::Behaviors::Bumper* rb4 = new SL::Behaviors::Bumper(false);
	SL::Behaviors::Motor* mt5 = new SL::Behaviors::Motor(-255,-100); 
	SL::Behaviors::Motor* mt6 = new SL::Behaviors::Motor(-100,-255); 
	SL::Behaviors::DelayTime* wt7 = new SL::Behaviors::DelayTime(1000); 
	SL::Behaviors::DelayTime* wt8 = new SL::Behaviors::DelayTime(1000); 
	SL::Behaviors::Motor* mt9 = new SL::Behaviors::Motor(255,255); 
	BehaviorTree::ParallelNode* p10 = new BehaviorTree::ParallelNode(FAIL_ON_ALL,SUCCEED_ON_ALL);
	BehaviorTree::StatusOverride* so11= new BehaviorTree::StatusOverride(2,0,0);
	BehaviorTree::SequentialNode* s11 = new BehaviorTree::SequentialNode();
	SL::Behaviors::TurnLed* tl12 = new SL::Behaviors::TurnLed(true);
	SL::Behaviors::TurnLed* tl13 = new SL::Behaviors::TurnLed(false);
	SL::Behaviors::DelayTime* wt14 = new SL::Behaviors::DelayTime(1000); 
	SL::Behaviors::DelayTime* wt15 = new SL::Behaviors::DelayTime(1000); 
	SL::Behaviors::IRSense* ir16 = new SL::Behaviors::IRSense(300,false); 
	SL::Behaviors::Motor* mt17 = new SL::Behaviors::Motor(-255,0); 
	SL::Behaviors::DelayTime* wt18 = new SL::Behaviors::DelayTime(1000); 
	BehaviorTree::SequentialNode* s19 = new BehaviorTree::SequentialNode();
	SL::Behaviors::ServoRange* sr20 = new SL::Behaviors::ServoRange(0,160,10); 
	
	Serial.begin(9600);
	pinMode(13, OUTPUT);
	GameLogic* logic = new GameLogic();
	f->brain->addChild(p10
	
	->addChild(so0->addChild(pr0->addChild(s19->addChild(ir16)->addChild(mt17)->addChild(wt18))->addChild(s1->addChild(rb3)->addChild(mt5)->addChild(wt7))->addChild(s2->addChild(rb4)->addChild(mt6)->addChild(wt8))->addChild(mt9)))->addChild(so11->addChild(s11->addChild(tl12)->addChild(wt14)->addChild(tl13)->addChild(wt15)))->addChild(sr20));
	
	
	state->insertObject(f);
	SL::gl = logic;  
	SL::ws = state; 
	
}
void loop(){

	gl->step();
}
