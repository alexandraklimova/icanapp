<!doctype html>
<html>
	<head>
		<meta name="layout" content="bootstrap"/>
		<title>Grails Twitter Bootstrap Scaffolding</title>
	</head>

	<body>
		<div class="row-fluid">

			<section id="main" class="span9">

				<div class="hero-unit">
					<h1>Profile</h1>
					<p>${message}</p>
				</div>				

						<form class="form-horizontal well">
        <fieldset>
          <legend>Controls Bootstrap supports</legend>
          <div class="control-group">
            <label class="control-label" for="input01">Text input</label>
            <div class="controls">
              <input type="text" class="input-xlarge" id="input01">
              <p class="help-block">In addition to freeform text, any HTML5 text-based input appears like so.</p>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="optionsCheckbox">Checkbox</label>
            <div class="controls">
              <label class="checkbox">
                <input type="checkbox" id="optionsCheckbox" value="option1">
                Option one is this and that—be sure to include why it's great
              </label>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="select01">Select list</label>
            <div class="controls">
              <select id="select01">
                <option>something</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
              </select>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="multiSelect">Multicon-select</label>
            <div class="controls">
              <select multiple="multiple" id="multiSelect">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
              </select>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="fileInput">File input</label>
            <div class="controls">
              <input class="input-file" id="fileInput" type="file">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="textarea">Textarea</label>
            <div class="controls">
              <textarea class="input-xlarge" id="textarea" rows="3"></textarea>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="focusedInput">Focused input</label>
            <div class="controls">
              <input class="input-xlarge focused" id="focusedInput" type="text" value="This is focused…">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Uneditable input</label>
            <div class="controls">
              <span class="input-xlarge uneditable-input">Some value here</span>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="disabledInput">Disabled input</label>
            <div class="controls">
              <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here…" disabled="">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="optionsCheckbox2">Disabled checkbox</label>
            <div class="controls">
              <label class="checkbox">
                <input type="checkbox" id="optionsCheckbox2" value="option1" disabled="">
                This is a disabled checkbox
              </label>
            </div>
          </div>
          <div class="control-group warning">
            <label class="control-label" for="inputWarning">Input with warning</label>
            <div class="controls">
              <input type="text" id="inputWarning">
              <span class="help-inline">Something may have gone wrong</span>
            </div>
          </div>
          <div class="control-group error">
            <label class="control-label" for="inputError">Input with error</label>
            <div class="controls">
              <input type="text" id="inputError">
              <span class="help-inline">Please correct the error</span>
            </div>
          </div>
          <div class="control-group success">
            <label class="control-label" for="inputSuccess">Input with success</label>
            <div class="controls">
              <input type="text" id="inputSuccess">
              <span class="help-inline">Woohoo!</span>
            </div>
          </div>
          <div class="control-group success">
            <label class="control-label" for="selectError">Select with success</label>
            <div class="controls">
              <select id="selectError">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
              </select>
              <span class="help-inline">Woohoo!</span>
            </div>
          </div>
          <div class="form-actions">
            <button type="submit" class="btn btn-primary">Save changes</button>
            <button type="reset" class="btn">Cancel</button>
          </div>
        </fieldset>
      </form>
			</section>
		</div>
		
	
	</body>
</html>
